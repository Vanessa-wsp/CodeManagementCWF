package com.sddevops.codemanagementcwf_maven.eclipse;
import java.util.Comparator;
import java.util.Objects;

public class Drama {
	private String id;
	private String title;
	private int releasedyear;
	private int episodes; //Number of episode
	
	/**
	 * @param id
	 * @param title
	 * @param releasedyear
	 * @param episodes
	 */
	
	public Drama(String id, String title, int releasedyear, int episodes) {
		super();
		this.id = id;
		this.title = title;
		this.releasedyear = releasedyear;
		this.episodes = episodes;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getReleasedyear() {
		return releasedyear;
	}

	public void setReleasedyear(int releasedyear) {
		this.releasedyear = releasedyear;
	}

	public int getEpisodes() {
		return episodes;
	}

	public void setEpisodes(int episodes) {
		this.episodes = episodes;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Drama))
			return false;
		Drama other = (Drama) obj;
		return Objects.equals(releasedyear, other.releasedyear) && Objects.equals(id, other.id)
				&& Objects.equals(episodes, other.episodes)
				&& Objects.equals(title, other.title);
	}

	public static Comparator<Drama> titleComparator = new Comparator<Drama>() {
		@Override
		public int compare(Drama s1, Drama s2) {
			return (int) (s1.getTitle().compareTo(s2.getTitle()));
		}
	};

	public static Comparator<Drama> episodeComparator = new Comparator<Drama>() {
		@Override         
	    public int compare(Drama s1, Drama s2) {             
	      return (s2.getEpisodes() < s1.getEpisodes() ? -1 :                     
	              (s2.getEpisodes() == s1.getEpisodes() ? 0 : 1));           
	    }     
	};
	
}
