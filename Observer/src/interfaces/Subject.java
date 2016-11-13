package interfaces;

public interface Subject {
    public void saveObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();
}
