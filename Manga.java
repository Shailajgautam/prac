
class Manga {
    private String title;
    private String mangaka;
    private String mainCharacter;

    public Manga(String title, String mangaka, String mainCharacter) {
        this.title = title;
        this.mangaka = mangaka;
        this.mainCharacter = mainCharacter;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setMangaka(String newMangaka) {
        this.mangaka = mangaka;
    }

    public void setMainCharacter(String newMainCharacter) {
        this.mainCharacter = mainCharacter;
    }

    public String getMangaka() {
        return mangaka;
    }

    public String getMainCharacter() {
        return mainCharacter;
    }

    public void displayInfo() {
        System.out.println("Manga Title: " + title);
        System.out.println("Manga Mangaka: " + mangaka);
        System.out.println("Main Character: " + mainCharacter);
    }

}


