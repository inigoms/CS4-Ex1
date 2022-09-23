class Main {
	public static void main(String[] args) {
		Instrument keyboard = new instrument(5.5, "MIDI", "gold");
		Instrument violin = new instrument(4, "string", "brown and black");
		Instrument recorder = new instrument(2.5, "wind", "beige");
		Song piece1 = new Song("Bach - Agnus Dei", 6.5, 1749);
		Song piece2 = new Song("Handel - Ombra mai fu", 3, 1738);
		Singer Andreas = new Singer("Andreas Scholl", 0, 0, piece1, piece2);
		System.out.println("Singer Name: " + Singer.getName());
		System.out.println("No of Performances: " + Singer.getNoOfPerformances());
		System.out.println("Earnings: " + Singer.getEarnings());
		System.out.println("Favorite Song: " + Singer.getFavoriteSong().title);
		System.out.println("");
		Andreas.performForAudience(12);
		Andreas.change();
		System.out.println("No of Performances: " + Singer.getNoOfPerformances());
		System.out.println("Earnings: " + Singer.getEarnings());
		System.out.println("Favorite Song: " + Singer.getFavoriteSong().title);
	}
}
