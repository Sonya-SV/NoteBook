package test;


import notebook.controller.Controller;
import org.junit.Assert;
import org.junit.Test;

import static notebook.controller.Regex.*;

public class ControllerTest {

    private Controller controller;

    @Test
    public void testRegexName() {
        Assert.assertTrue("Walt".matches(REGEX_NAME_EN));
        Assert.assertTrue("Sdkfjsdklf".matches(REGEX_NAME_EN));
        Assert.assertTrue("Dkdjfks".matches(REGEX_NAME_EN));
        Assert.assertFalse("Fhjd1f1".matches(REGEX_NAME_EN));
        Assert.assertFalse("qqqqqqqqqqqqqqqqqqqqqqqqqqq".matches(REGEX_NAME_EN));

        Assert.assertTrue("Волт".matches(REGEX_NAME_UK));
        Assert.assertTrue("Амінодиїл".matches(REGEX_NAME_UK));
        Assert.assertTrue("Ілля".matches(REGEX_NAME_UK));
        Assert.assertFalse("Fffffїїїїїї".matches(REGEX_NAME_UK));
        Assert.assertFalse("ілля".matches(REGEX_NAME_UK));
    }

    @Test
    public void testRegexEmail() {
        Assert.assertTrue("Sonya.dsf@f.df".matches(REGEX_EMAIL));
        Assert.assertTrue("Sdkf.sd.dds@dsf.dfssss".matches(REGEX_EMAIL));
        Assert.assertTrue("Dk3425d@jfh.fg".matches(REGEX_EMAIL));
        Assert.assertFalse("fngn@g.g".matches(REGEX_EMAIL));
        Assert.assertFalse("dfssdg.f".matches(REGEX_EMAIL));
    }

    @Test
    public void testRegexPhone() {
        Assert.assertTrue("(067)987-87-98".matches(REGEX_HOME_PHONE));
        Assert.assertTrue("+7(098)876-54-76".matches(REGEX_HOME_PHONE));
        Assert.assertTrue("38(098)870-98-87".matches(REGEX_HOME_PHONE));
        Assert.assertFalse("0671441567".matches(REGEX_HOME_PHONE));
        Assert.assertFalse("(067)12-342-12".matches(REGEX_HOME_PHONE));
        Assert.assertFalse("+7(098)8768787".matches(REGEX_HOME_PHONE));
        Assert.assertFalse("380671441589".matches(REGEX_HOME_PHONE));
    }

    @Test
    public void testRegexHomeNumber() {
        Assert.assertTrue("22a".matches(REGEX_HOME_NUMBER_EN));
        Assert.assertTrue("333".matches(REGEX_HOME_NUMBER_EN));
        Assert.assertTrue("765a/23".matches(REGEX_HOME_NUMBER_EN));
        Assert.assertTrue("221B".matches(REGEX_HOME_NUMBER_EN));

        Assert.assertTrue("221ї".matches(REGEX_HOME_NUMBER_UK));
        Assert.assertFalse("23/їs".matches(REGEX_HOME_NUMBER_UK));
        Assert.assertFalse("ї".matches(REGEX_HOME_NUMBER_UK));
        Assert.assertFalse("ї34".matches(REGEX_HOME_NUMBER_UK));
        Assert.assertFalse("45678".matches(REGEX_HOME_NUMBER_UK));
    }

    @Test
    public void testRegexFlat() {
        Assert.assertTrue("22a".matches(REGEX_FLAT_NUMBER_EN));
        Assert.assertTrue("333".matches(REGEX_FLAT_NUMBER_EN));

        Assert.assertTrue("765ї".matches(REGEX_FLAT_NUMBER_UK));
        Assert.assertFalse("23її".matches(REGEX_FLAT_NUMBER_UK));
        Assert.assertFalse("ї".matches(REGEX_FLAT_NUMBER_UK));
        Assert.assertFalse("ї34".matches(REGEX_FLAT_NUMBER_UK));
        Assert.assertFalse("45678".matches(REGEX_FLAT_NUMBER_UK));
    }

    @Test
    public void testRegexDate() {
        Assert.assertTrue("22.04.1999".matches(REGEX_DATE_UK));
        Assert.assertTrue("01.12.12".matches(REGEX_DATE_UK));
        Assert.assertTrue("2.2.22".matches(REGEX_DATE_UK));
        Assert.assertFalse("32.12.45".matches(REGEX_DATE_UK));
        Assert.assertFalse("12.13.1888".matches(REGEX_DATE_UK));
        Assert.assertFalse("12.12.123".matches(REGEX_DATE_UK));
        Assert.assertFalse("01.00.1920".matches(REGEX_DATE_UK));

        Assert.assertTrue("12/04/1999".matches(REGEX_DATE_EN));
        Assert.assertTrue("12/04/12".matches(REGEX_DATE_EN));
        Assert.assertTrue("2/2/22".matches(REGEX_DATE_EN));
        Assert.assertFalse("32.12.45".matches(REGEX_DATE_EN));
        Assert.assertFalse("13/1/1888".matches(REGEX_DATE_EN));
        Assert.assertFalse("12/32/1233".matches(REGEX_DATE_EN));
        Assert.assertFalse("01/00/1920".matches(REGEX_DATE_EN));
    }

    @Test
    public void testRegexCity() {
        Assert.assertTrue("Kyiv".matches(REGEX_CITY_AND_STREET_EN));
        Assert.assertTrue("Asd s d f".matches(REGEX_CITY_AND_STREET_EN));

        Assert.assertTrue("Київ".matches(REGEX_CITY_AND_STREET_UK));
        Assert.assertTrue("Лос-Анджелес".matches(REGEX_CITY_AND_STREET_UK));
        Assert.assertTrue("Мінеральні Води".matches(REGEX_CITY_AND_STREET_UK));
        Assert.assertFalse("київ".matches(REGEX_CITY_AND_STREET_UK));
        Assert.assertFalse("Київ12".matches(REGEX_CITY_AND_STREET_UK));
        Assert.assertFalse("алаff".matches(REGEX_CITY_AND_STREET_UK));
        Assert.assertFalse("".matches(REGEX_CITY_AND_STREET_UK));
    }


}
