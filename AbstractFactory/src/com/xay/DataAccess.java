package com.xay;

/**
 * @author ziling.wang@hand-china.com
 * @description
 * @date 2020/7/23 1:21
 **/
public class DataAccess {

    private static final String DB = "mysql";

    private DataAccess(){}

    public static IUser createUser() {
        switch (DB) {
            case "mysql":
                return new MysqlUser();
            case "sqlserver":
                return new SqlServerUser();
            default:
                return null;
        }
    }

    public static IDepartment createDepartment() {
        switch (DB) {
            case "mysql":
                return new MysqlDepartment();
            case "sqlserver":
                return new SqlServerDepartment();
            default:
                return null;
        }
    }
}
