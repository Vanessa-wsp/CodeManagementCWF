package com.sddevops.codemanagementcwf_maven.eclipse;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class DramaCollectionTest {
	private DramaCollection sc;
	private Drama s1;
	private Drama s2;
	private Drama s3;
	private Drama s4;
	private final int DRAMA_COLLECTION_SIZE = 4;
	private final int DRAMA_CAPACITY_LIMIT = 5;

	@BeforeEach
	void setUp() throws Exception {
		sc = new DramaCollection();
		s1 = new Drama("0001", "Mr Bad", 2022, 24);
		s2 = new Drama("0002", "RENASCENCE", 2020, 36);
		s3 = new Drama("0003", "Flavour Its Yours", 2019, 25);
		s4 = new Drama("0004", "The Legends", 2019, 55);

		sc.addDrama(s1);
		sc.addDrama(s2);
		sc.addDrama(s3);
		sc.addDrama(s4);
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testDramaCollection() {
		// fail("Not yet implemented");
		System.out.println("@Test: testDramaCollection");
		assertTrue(true);
	}// try true and false }

	@Test
	void testDramaCollectionInt() {
		// fail("Not yet implemented");
		System.out.println("@Test: testDramaCollectionInt");
		assertTrue(true);
	}// try true and false }

	@Test
	void testGetDramas() {
		// fail("Not yet implemented");
		List<Drama> testSc = sc.getDramas();
		// Assert
		// assertTrue(!testSc.isEmpty());
		assertFalse(testSc.isEmpty());
		assertEquals(testSc.size(), DRAMA_COLLECTION_SIZE);
	}

	@Test
	void testAddDrama() {
		// fail("Not yet implemented");
		List<Drama> testSc = sc.getDramas();
		// Assert that Drama collection is equals to drama collection size 4
		assertEquals(testSc.size(), DRAMA_COLLECTION_SIZE);
		// Act - Add drama function to add 1 additional drama
		sc.addDrama(s1);
		// Assert that Drama Collection is equals to drama collection size 4 + 1
		// We assert that the initial drama collection size is now 5
		assertEquals(sc.getDramas().size(), DRAMA_COLLECTION_SIZE + 1);
		// means "a passed parameter must not be null": if it is null then the test case
		// fails.
		assertNotNull(s1);
		// Assert that Drama Collection cannot be more than 5 (max capacity)
		assertEquals(sc.getDramas().size(), DRAMA_CAPACITY_LIMIT);
	}

	@Test
	void testSortDramasByTitle() {
		// fail("Not yet implemented");

		// Act
		List<Drama> testSc = sc.sortDramasByTitle();

		// Arrange
		String newDramaTitle1 = testSc.get(0).getTitle();
		String newDramaTitle2 = testSc.get(1).getTitle();
		String newDramaTitle3 = testSc.get(2).getTitle();
		String newDramaTitle4 = testSc.get(3).getTitle();

		// Assert that the Song list sorted from [A-Z] [a-z]
		assertEquals(newDramaTitle2, "Mr Bad");
		assertEquals(newDramaTitle3, "RENASCENCE");
		assertEquals(newDramaTitle1, "Flavour Its Yours");
		assertEquals(newDramaTitle4, "The Legends");
	}

	@Test
	void testSortDramasByEpisodes() {
		fail("Not yet implemented");
		// fail("Not yet implemented");
		// Act
		List<Drama> testSc = sc.sortDramasByEpisodes();

		// arrange
		int newEpisode1 = testSc.get(0).getEpisodes();
		int newEpisode2 = testSc.get(1).getEpisodes();
		int newEpisode3 = testSc.get(2).getEpisodes();
		int newEpisode4 = testSc.get(3).getEpisodes();

		// Assert that the the song list is sorted from largest to shortest song length
		assertTrue(Double.compare(newEpisode1, newEpisode2) > 0);
		assertTrue(Double.compare(newEpisode2, newEpisode3) > 0);
		assertTrue(Double.compare(newEpisode3, newEpisode4) > 0);
	}

	@Test
	void testFindDramasById() {
		// fail("Not yet implemented");
		// Act
		Drama validId = sc.findDramasById("0003");
		Drama invalidId = sc.findDramasById("Invalid id");

		// assert we retrieve a valid song
		assertNotNull(validId);
		// assert retrieve the accurate song based on Id
		assertEquals(validId.getId(), "0003");
		// assert if we input invalid id : we get a null
		assertNull(invalidId);
	}

	@Test
	void testFindDramasByTitle() {
		// fail("Not yet implemented");

		Drama validDrama = sc.findDramasByTitle("Flavour Its Yours");
		Drama invalidDrama = sc.findDramasByTitle("Invalid Song Title");

		// assert we retrieve a valid song
		assertNotNull(validDrama);
		// assert retrieve the accurate song based on Id
		assertEquals(validDrama.getId(), "0003");
		// assert if we input invalid id : we get a null
		assertNull(invalidDrama);
	}

}
