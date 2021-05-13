package Iterator;
//迭代器模式
//定义：提供一种方法顺序访问一个聚合对象中各个元素, 而又无须暴露该对象的内部表示。
//举例（咖啡厅和中餐厅合并，他们两个餐厅的菜单一个是数组保存的，一个是ArrayList保存的。遍历方式不一样，使用迭代器聚合访问，只需要一种方式）
public interface Iterator {
    public boolean hasNext();
    public Object next();
}
