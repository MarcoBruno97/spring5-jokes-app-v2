package guru.framework.chucknorrisquotes.services;


import org.springframework.stereotype.Service;

@Service
public interface QuotesService {

    String getRandomQuote();
}
