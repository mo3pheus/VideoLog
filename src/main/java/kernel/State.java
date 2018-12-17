package kernel;

public interface State {
    void listen();
    void record();
    void retrieve();
    void save();
}
