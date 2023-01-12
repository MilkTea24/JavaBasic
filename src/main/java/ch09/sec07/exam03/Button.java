package ch09.sec07.exam03;

public class Button {
    public interface ClickListener {
        public void onClick();
    }
    ClickListener clickListener;
    void setClickListener(ClickListener clickListener) {
        this.clickListener = clickListener;
    }

    void click() {
        this.clickListener.onClick();
    }
}
