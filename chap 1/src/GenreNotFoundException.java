/**
 * @author 민경수
 * @description genre not found exception
 * @since 2021.09.11
 **********************************************************************************************************************/
public class GenreNotFoundException extends RuntimeException{
    private String genre;

    public GenreNotFoundException(String genre){
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}