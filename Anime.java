class Anime extends Manga {
    private int numberOfEpisodes;

    public Anime(String title, String mangaka, String mainCharacter, int numberOfEpisodes) {
        super(title, mangaka, mainCharacter);
        this.numberOfEpisodes = numberOfEpisodes;
    }

    public int getNumberOfEpisodes() {
        return numberOfEpisodes;
    }

    public void setNumberOfEpisodes(int numberOfEpisodes) {
        this.numberOfEpisodes = numberOfEpisodes;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Number of Episodes: " + numberOfEpisodes);
    }
}