package com.mydesign.utils;

public class Constants {

    public final static String NO_NAME_SPACE = "";
    public final static String PREFIX_URL = "http://bo.fks.com";
    public final static String NO_ACTION = "";
    public final static String ARTICLE_BY_ARTICLE_CODE = "bo:searchArticleByEAN";


    public static final String[] TITLES = {"Approved", "Pending", "Rejected"};
    public static final String[] REQUEST_TYPES = {"Approved", "Open", "Rejected"};

    public static final String USER_RESPONSE = "user_response";
    public static final String DESIRED_PRICE = "desired_price";
    public static final String REQUEST_TYPE = "request_type";
    public static final String REQUEST_DETAILS = "request_details";

    public static final String NO_RECORDS = "No Record Found.";

    public static class AbstractVarTag {

        public static final String NULL_STRING = "";
        public static final String SUB_CLASS_INITIALIZE = "assign_sub_class";
        public static final String API_CALL = "api_access_permission";
    }

    //created
    public static class PRIVATE_FILE {
        public static final String CRASH_LOG_DIR_NAME = "CrashLogData";
        public static final String JSON_DATA_DIR_NAME = "JsonData";
        public static final String JSON_LIST_FILE_NAME = "json_dashboard_list_ui_file";
        public static final String JSON_DEVICE_DETAILS_FILE_NAME = "json_device_details_ui_file";
        public static final String JSON_MORE_MENU_OPTIONS_FILE_NAME = "json_more_menu_options_ui_file";
        public static final String CRASH_LOG_FILE_NAME = "crash_logs";
    }


    public interface Status {
        String APPROVE = "Approved";
        String REJECT = "Rejected";
        String PENDING = "Open";
    }

    public interface ArticleDetails {
        String ARTICLE_CODE = "articleCode";
        String ARTICLE_DESC = "articleDesc";
        String ARTICLE_TYPE = "articletype";
        String BRAND = "brand";
        String BRAND_DESC = "brandDesc";
        String LOB_CODE = "lobCode";
        String LOB_NAME = "lobName";
        String MC_CODE = "mcCode";
        String MC_DESC = "mcDesc";
        String MRP = "mrp";
        String MSG = "msg";
        String SEASON_CODE = "seasonCode";
        String UOM = "uom";
        String WARRANTY_FLAG = "warrntyFlag";
    }
}
