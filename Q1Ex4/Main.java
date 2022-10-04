class Main {
	public static void main(String[] args) {
		Instrument keyboard = new Instrument("keyboard", 5.5, "MIDI");
		Instrument violin = new Instrument("violin", 4, "string");
		Instrument recorder = new Instrument("recorder", 2.5, "wind");
		Song piece1 = new Song("Handel - Ombra mai fu", 3, 1738);
		Song piece2 = new Song("Bach - Agnus Dei", 6.5, 1749);
		Singer Andreas = new Singer("Andreas Scholl", 0, 0, piece1);
		System.out.println("Instrument Name: " + keyboard.getIName());
		System.out.println("   Range: " + keyboard.getIRange());
		System.out.println("   Type: " + keyboard.getIType());
		System.out.println("Instrument Name: " + violin.getIName());
		System.out.println("   Range: " + violin.getIRange());
		System.out.println("   Type: " + violin.getIType());
		System.out.println("Instrument Name: " + recorder.getIName());
		System.out.println("   Range: " + recorder.getIRange());
		System.out.println("   Type: " + recorder.getIType());
		System.out.println("");
		System.out.println("Singer Name: " + Andreas.getName());
		System.out.println("Total no. of Performances: " + Andreas.getTotalPerformances());
		System.out.println("Earnings: " + Andreas.getEarnings());
		System.out.println("Favorite Song Title: " + Andreas.getFavoriteSong().getTitle());
		System.out.println("   Duration: " + Andreas.getFavoriteSong().getDuration() + " min");
		System.out.println("   Year composed: " + Andreas.getFavoriteSong().getYearComposed());
		System.out.println("");
		Andreas.performForAudience(12);
		Andreas.changeFavSong(piece2);
		System.out.println("Total No. of Performances: " + Andreas.getTotalPerformances());
		System.out.println("Earnings: " + Andreas.getEarnings());
		System.out.println("Favorite Song Title: " + Andreas.getFavoriteSong().getTitle());
		System.out.println("   Duration: " + Andreas.getFavoriteSong().getDuration() + " min");
		System.out.println("   Year composed: " + Andreas.getFavoriteSong().getYearComposed());
		System.out.println("");
		Andreas.performForAudience(12, 2); // 2 singers
		System.out.println("Total No. of Performances: " + Andreas.getTotalPerformances());
		System.out.println("Earnings (2 singers): " + Andreas.getEarnings());
		System.out.println("");
		Andreas.performForAudience(12, 2); // 2 singers
		System.out.println("Total No. of Performances: " + Andreas.getTotalPerformances());
		System.out.println("Earnings (2 singers): " + Andreas.getEarnings());
		System.out.println("");
		Andreas.performForAudience(12);
		System.out.println("Total No. of Performances: " + Andreas.getTotalPerformances());
		System.out.println("Earnings: " + Andreas.getEarnings());
	}
}
