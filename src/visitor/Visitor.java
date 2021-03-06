package visitor;

import javax.lang.model.element.Element;

//访问者模式
//定义：将作用于某种数据结构中的各元素的操作分离出来封装成独立的类，使其在不改变数据结构的前提下可以添加作用于这些元素的新的操作，为数据结构中的每个元素提供多种访问方式。它将对数据的操作与数据结构进行分离。
public interface Visitor {
    abstract public void Visit(Element element);

}
