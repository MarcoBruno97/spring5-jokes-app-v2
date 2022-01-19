package guru.framework.chucknorrisquotes.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;


@Service
public class QuotesServiceImpl implements QuotesService{

    private final ChuckNorrisQuotes chuckNorrisQuote;

    public QuotesServiceImpl() {
        this.chuckNorrisQuote = new ChuckNorrisQuotes();
    }

    @Override
    public String getRandomQuote() {
        return chuckNorrisQuote.getRandomQuote();
    }
}
