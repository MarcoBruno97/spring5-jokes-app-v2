package guru.framework.chucknorrisquotes.controllers;

import guru.framework.chucknorrisquotes.services.QuotesService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class QuotesController {
    private final QuotesService quotesService;

    public QuotesController(QuotesService quotesService) {
        this.quotesService = quotesService;
    }

    @RequestMapping({"/", ""})
    public String getQuote(Model model){
        model.addAttribute("quote",quotesService.getRandomQuote());
        return "quote";
    }

}
