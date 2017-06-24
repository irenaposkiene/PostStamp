


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.List;

import philatelist.Philatelist;
import philatelist.PostStamp;

public class MyPhila implements Philatelist {
	
	

	private List<PostStamp> post= new ArrayList<PostStamp>(); 
	
	@Override
	public void addToCollection(PostStamp p) {
		// TODO Auto-generated method stub
		if (p.equals(null)) {
			throw new IllegalArgumentException();
		}
		if (p.getName().isEmpty()){
			 throw new IllegalArgumentException();
		}
		if (p.getName().equals(null)) {
			throw new IllegalArgumentException();
		}
				
		
	/*	for (PostStamp zenkl:post) {
			if (p.equals(zenkl)) {
				throw new IllegalArgumentException();
			}
			
		}*/
			
			post.add(p);
			
		
	}

	@Override
	public double getAveragePostStampPrice() {
		// TODO Auto-generated method stub
		double avg =0;
		for  (PostStamp zenkl:post) {
		avg += zenkl.getMarketPrice();
		}
		return avg/post.size();
	}

	@Override
	public int getNumberOfPostStampsInCollection() {
		// TODO Auto-generated method stub
		return post.size();
	}

	@Override
	public PostStamp getTheMostExpensivePostStamByMarketValue() {
		// TODO Auto-generated method stub
	
		
/*		Collections.sort(post, new Comparator<PostStamp> () {

			@Override
			public int compare(PostStamp p1, PostStamp p2) {
				// TODO Auto-generated method stub
				if (p1.getMarketPrice()>p2.getMarketPrice()) {
					return 1;
				}
				
				else if  (p1.getMarketPrice()<p2.getMarketPrice()) {
					return -1;
				}
				else return 0;
			} 
			
		});
		
		
		
		return post.get(post.indexOf(post.size()-1));
		}
		*/
	
	PostStamp p = post.get(0);
	
	for (PostStamp pp: post) {
		if (pp.getMarketPrice()>p.getMarketPrice()) {
			p=pp;
		}
	}return p;
	}
	

}
