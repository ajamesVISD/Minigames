package org.vashonsd.Utils;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by andy on 5/20/18.
 */
public class APITest {

    private String sampleJSON;
    private String uri;

    @Before
    public void setUp() throws Exception {
        sampleJSON = "{\"key\": \"value\", \"hope\": \"Thing with feathers\"}";
        uri = "https://world.openfoodfacts.org/api/v0/product/737628064502.json";
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testParseJSONToMap() throws Exception {
        System.out.println(API.parseJSONToMap(sampleJSON));
    }

    @Test
    public void testCallAPI() throws Exception {
        System.out.println(API.callAPI(uri));
    }


//    @Test
    public void testMapFromAPICall() throws Exception {
        System.out.println(API.mapFromAPICall(uri));
    }
}