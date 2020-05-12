package ru.netology;

import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class DeliveryCardTest {
    @Test
    void shouldDeliveryCard(){
        open("http://localhost:9999");
        SelenideElement form = $("[data-test-id = app-card-delivery]");
        Calendar calendar = new GregorianCalendar(2017, 0 , 25);
        Date date = calendar.getTime();
        $("[placeholder='Город']").setValue("Екатеринбург");
        $("[placeholder='Дата встречи'][type='date']").setValue(calendar.set(Calendar.HOUR,72);
        $("[name='name']).setValue('Иванов Иван Иванович');
        $("[name='phone']).setValue('+79200000000');
        $$("button").find(exactText("Забронировать")).click();
        $(withText("Успешно! Встреча забронирована на []")).waitUntil(visible, 15000);
    }

}
