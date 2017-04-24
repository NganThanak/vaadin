package com.mkyong;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.Title;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.Button;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

/**
 * Created by Admin on 4/21/2017.
 */
@SpringUI(path = "/ui")
@Title("Spring Vaadin")
@Theme("valo")
public class MainView extends UI {

    protected void init(VaadinRequest vaadinRequest) {

        final VerticalLayout verticalLayout =new VerticalLayout();


        Button button=new Button("Click...");
        verticalLayout.addComponent(button);
        verticalLayout.addComponent(new Label("Welcome to spring boot."));
        setContent(verticalLayout);

    }
}
