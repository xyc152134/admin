package dr.xyc.week02.day04;

import dr.xyc.week02.day01.Employee;

import java.lang.annotation.ElementType;
import java.util.Arrays;

public class CustomArrayList<T> {
    //存元素的数组
    private Object[] elementData;
    //记录集合中有多少元素
    private int size;
    private int count;

    private static final Object[] DLEFAULT_ELEMENT_DATA = new Object[0];

    public CustomArrayList() {
        elementData = DLEFAULT_ELEMENT_DATA;
    }

    //添加元素
    public void add(T obj) {
        dilatation();
        elementData[size++] = obj;

    }


    public void dilatation() {
        if (!(size < count)) {  //判断数组长度是否够，不够用Arraycopyof扩容
            elementData = Arrays.copyOf(elementData, count + 16);
            count += 16;


        }
    }

    //获取元素
    public Object get(int index) {
        if (index < 0 || index >= size) {
            throw  new CustbomException("下标越界，越界的值是： "+index+",当前最大值是："+(size-1));
        } else {
            return (T) elementData[index];
        }
    }

    //获取元素长度 size被私有了所以通过public来获取
    public int size() {
        return size;
    }

    //删除
    public T remove(int index) {
        if (index < 0 || index >= size) {
            throw  new CustbomException("下标越界，越界的值是： "+index+",当前最大值是："+(size-1));
        } else {
            Object temp = elementData[index];
            Object[] objects = new Object[count];
            System.arraycopy(elementData, 0, objects, 0, index);
            System.arraycopy(elementData, index + 1, objects, index, size - index);
            elementData = objects;
            return (T) temp;

        }


    }

    //修改
    public T set(T newData, int index) {
        if (index < 0 || index >= size) {
            throw  new CustbomException("下标越界，越界的值是： "+index+",当前最大值是："+(size-1));
        } else {
            Object temp = elementData[index];
            elementData[index] = newData;
            return (T) temp;

        }


    }

    //插入
    public void insert(T newData,int index) {
        if (index < 0 || index >= size) {
            throw  new CustbomException("下标越界，越界的值是： "+index+",当前最大值是："+(size-1));
        }else {
            System.arraycopy(elementData,index,elementData,index+1,size-index);
            elementData[index]=newData;
        }

    }


}
