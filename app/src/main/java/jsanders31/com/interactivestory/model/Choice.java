package jsanders31.com.interactivestory.model;

/**
 * Created by jess on 6/30/15.
 */
public class Choice {

    private String mText;
    private int mNextPage;

    public String getText() {
        return mText;
    }

    public void setText(String text) {
        mText = text;
    }

    public int getNextPage() {
        return mNextPage;
    }

    public void setNextPage(int nextPage) {
        mNextPage = nextPage;
    }

    //a custom constructor
    public Choice(String text, int nextPage){
        mText = text;
        mNextPage = nextPage;
    }
}
