package ee.sdacademy.thymleaf.contacts.controllers;

import ee.sdacademy.thymleaf.contacts.domain.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import ee.sdacademy.thymleaf.contacts.services.ContactService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class IndexPageController {

    @Autowired
    private ContactService contactService;

    @GetMapping("/")
    public String mainPage(Model model) {

        model.addAttribute("contacts", contactService.getAllContacts());
        return "index";
    }

    @GetMapping("/view")
    public String viewContact(@RequestParam Integer id, Model model){
        model.addAttribute("contact", contactService.get(id));
        model.addAttribute("phones", contactService.getAllPhonesByContactId(id));
        return "view";
    }

    @GetMapping("/createContact")
    public String createContactPage(Model model){
        model.addAttribute("newContact", true);
        model.addAttribute("contact", new Contact());
        return "createEditContact";
    }
}
