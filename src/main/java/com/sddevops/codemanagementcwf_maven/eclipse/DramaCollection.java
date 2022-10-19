package com.sddevops.codemanagementcwf_maven.eclipse;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DramaCollection {
    private ArrayList<Drama> dramas = new ArrayList<>();
    private int capacity;
    
    public DramaCollection() {
    	/*dramas.add(new Drama("0001","Mr Bad",2022,24));
    	dramas.add(new Drama("0002","RENASCENCE",2020,36));
    	dramas.add(new Drama("0003","Flavour Its Yours",2019,25));
    	dramas.add(new Drama("0004","The Legends",2019,55));*/

        this.capacity = 5;
    }
    
    public DramaCollection(int capacity) {
        this.capacity = capacity;
    }

    public List<Drama> getDramas() {
        return dramas;
    }
    
    public void addDrama(Drama drama) {
    	if(dramas.size() != capacity) {
    		dramas.add(drama);
    	}
    }
    
    public ArrayList<Drama> sortDramasByTitle() {         
        Collections.sort(dramas, Drama.titleComparator);         
        return dramas;     
    } 
    
    public ArrayList<Drama> sortDramasByEpisodes() {         
        Collections.sort(dramas, Drama.episodeComparator);         
        return dramas;     
    } 
    
    public Drama findDramasById(String id) {
    	for (Drama s : dramas) { 		      
            if(s.getId().equals(id)) return s;
       }
    	return null;
    }

    public Drama findDramasByTitle(String title) {
    	for (Drama s : dramas) { 		      
            if(s.getTitle().equals(title)) return s;
       }
    	return null;
    }
}
