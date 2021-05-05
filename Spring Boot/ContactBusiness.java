package com.example.SpringBootWebAppExample;
 
import java.util.ArrayList;
import java.util.List;
 
public class ContactBusiness {
    public List<Contact> getContactList() {
        List<Contact> listContact = new ArrayList<>();
         
      listContact.add(new Contact("Anudeep", "anudeep@gmail.com", "India"));
        listContact.add(new Contact("Yeswanth", "yesh@gmail.com", "India"));
        listContact.add(new Contact("Santosh", "santhu@gmail.com", "India"));
         
         
        return listContact;
    }
}