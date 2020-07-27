package com.xay.test;

import com.xay.Company;
import com.xay.ConcreteCompany;
import com.xay.FinanceDepartment;
import com.xay.HRDepartment;

/**
 * @author ziling.wang@hand-china.com
 * @description
 * @date 2020/7/27 23:26
 **/
public class CompositeTest {

    public static void main(String[] args) {
        Company root = new ConcreteCompany("上海总公司");
        root.add(new HRDepartment("总公司人力资源部"));
        root.add(new FinanceDepartment("总公司财务部"));

        Company c1 = new ConcreteCompany("苏州分公司");
        c1.add(new HRDepartment("苏州分公司人力资源部"));
        c1.add(new FinanceDepartment("苏州分公司财务部"));
        root.add(c1);

        Company c2 = new ConcreteCompany("昆山分公司");
        c2.add(new HRDepartment("昆山分公司人力资源部"));
        c2.add(new FinanceDepartment("昆山分公司财务部"));
        c1.add(c2);

        Company c3 = new ConcreteCompany("北京分公司");
        c3.add(new HRDepartment("北京分公司人力资源部"));
        c3.add(new FinanceDepartment("北京分公司财务部"));
        root.add(c3);

        root.display(1);
        System.out.println();
        root.lineOfDuty();
    }
}
