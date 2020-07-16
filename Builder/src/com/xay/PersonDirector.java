package com.xay;

/**
 * @author ziling.wang@hand-china.com
 * @description
 * @date 2020/7/17 0:05
 **/
public class PersonDirector {

    private Person person;

    public PersonDirector(Person person) {
        this.person = person;
    }

    public void buildPerson() {
        person.drawHead();
        person.drawBody();
        person.drawLeftHand();
        person.drawRightHand();
        person.drawLeftLeg();
        person.drawRightLeg();
    }
}
