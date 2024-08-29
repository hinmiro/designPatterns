package abstractFactory;

public class CheckboxB extends Checkbox {
    private String text;

    public CheckboxB(String text) {
        this.text = text;
    }
    public void display() {
        System.out.println(
                """
                                        \\||/
                                        |  @___oo      ☑
                              /\\  /\\   / (__,,,,|    ☑
                             ) /^\\) ^\\/ _)           ☑
                             )   /^\\/   _)            ☑
                             )   _ /  / _)
                         /\\  )/\\/ ||  | )_)
                        <  >      |(,,) )__)
                         ||      /    \\)___)\\
                         | \\____(      )___) )___
                          \\______(_______;;; __;;;"""+text);
    }
}
