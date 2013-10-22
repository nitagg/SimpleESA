package ie.deri.nlp.esa.mains;

import ie.deri.nlp.esa.processor.wiki.WikiTextIndexer;


public class IndexerMain {


	public static void main(String[] args) {
		String configPath = args[0];
		WikiTextIndexer indexer = new WikiTextIndexer(configPath);
		
		System.out.println("indexing start");
		indexer.index();
		System.out.println("indexing done");		
	}
	
}
