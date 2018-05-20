package org.vashonsd.Utils;

import com.fasterxml.jackson.core.io.JsonStringEncoder;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.lang.StringEscapeUtils;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by andy on 5/20/18.
 */
public class API {

    private static CloseableHttpClient httpclient;

    private static ObjectMapper mapper;

    /**
     * This is a simple utility for taking a String in JSON format and returning it as a Map of String : Object.
     *
     * @param json The JSON object, represented as a url-escape String, to be parsed.
     * @return a Map<String, String>
     */
    public static Map<String, Object> parseJSONToMap(String json) throws IOException {
        mapper = new ObjectMapper();
        mapper.enable(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT);
        mapper.enable(DeserializationFeature.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT);
        mapper.enable(DeserializationFeature.WRAP_EXCEPTIONS);
        TypeReference<HashMap<String, Object>> typeRef
                = new TypeReference<HashMap<String, Object>>() {};
        return mapper.readValue(json, typeRef);
    }

    public static String callAPI(String uri) throws IOException {
        httpclient = HttpClients.createDefault();
        HttpGet httpGet = new HttpGet(uri);
        CloseableHttpResponse response1 = httpclient.execute(httpGet);
        HttpEntity entity1 = response1.getEntity();
        String result;
        if(!(response1.getStatusLine().getStatusCode() == 200)) {
            throw new IOException(response1.getStatusLine().getReasonPhrase());
        } else {
            result = EntityUtils.toString(entity1);
        }
        return result;
    }

    public static Map<String, Object> mapFromAPICall(String uri) throws IOException {
        String resp = callAPI(uri);
        ObjectMapper mapper = new ObjectMapper();
        StringWriter writer = new StringWriter();
        mapper.writeValue(writer, resp);
        String jsonified = writer.toString();
        return parseJSONToMap(jsonified);
    }
}
