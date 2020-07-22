package com.xay;

/**
 * @author ziling.wang@hand-china.com
 * @description
 * @date 2020/7/23 1:20
 **/
public class MysqlFactory extends AbstractSqlFactory {
    @Override
    public IUser creteUser() {
        return new MysqlUser();
    }

    @Override
    public IDepartment createDepartment() {
        return new MysqlDepartment();
    }
}
