package challenge;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuoteServiceImpl implements QuoteService {

	@Autowired
	private QuoteRepository repository;

	@Override
	public Quote getQuote() {
		List<Quote> allTheQuotes = repository.findAll();
		Collections.shuffle(allTheQuotes);
		return allTheQuotes.get(0);
    } 

	@Override
	public Quote getQuoteByActor(String actor) {
        List<Quote> allTheQuotes = repository.findByActorLikeIgnoreCase('%' + actor + '%');
        Collections.shuffle(allTheQuotes);
		return allTheQuotes.get(0);
	}

}
