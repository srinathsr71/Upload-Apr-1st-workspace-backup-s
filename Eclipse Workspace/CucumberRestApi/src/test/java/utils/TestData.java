package utils;

public class TestData {
    public static String apiBody="{\n" +
            "  \"id\": 100,\n" +
            "  \"username\": \"Rachana\",\n" +
            "  \"firstName\": \"Lokesh\",\n" +
            "  \"lastName\": \"naveen\",\n" +
            "  \"email\": \"r.n@gmail.com\",\n" +
            "  \"password\": \"123pass\",\n" +
            "  \"phone\": \"9611342837\",\n" +
            "  \"userStatus\": 1\n" +
            "}";
//public static String apiBody="{\n"+
//	     "  \"name\": \"morpheus\",\n" +
//		"  \"job\": \"leader\",\n" +
//	"}";
    public static String getApiBody() {
        return apiBody;
    }

    public static void setApiBody(String apiBody) {
        TestData.apiBody = apiBody;
    }
}
