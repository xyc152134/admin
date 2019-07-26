package dr.xyc.week02.day04;

public class Test {
    public static void main(String[] args) {
        CustomArrayList<String> customArrayList = new CustomArrayList();
        customArrayList.add("admin");
        customArrayList.add("admin1");
        customArrayList.add("admin2");
        customArrayList.add("admin3");
        customArrayList.add("admin4");
        System.out.println("------这是测试遍历元素");
        for (int i = 0; i < customArrayList.size(); i++) {
            System.out.println(customArrayList.get(i));
        }
        System.out.println("------这是测试元素长度");
        System.out.println("长度" + customArrayList.size());
        System.out.println("------这是测试删除元素");
        System.out.println("删除的元素是：" + customArrayList.remove(0));
        for (int i = 0; i < customArrayList.size(); i++) {
            System.out.println(customArrayList.get(i));
        }
        System.out.println("------这是测试修改元素");
        System.out.println("修改元素" + customArrayList.set("修改的元素", 1));
        for (int i = 0; i < customArrayList.size(); i++) {
            System.out.println(customArrayList.get(i));
        }
        System.out.println("------这是测试插入元素");
        customArrayList.insert("插入元素", 0);
        for (int i = 0; i < customArrayList.size(); i++) {
            System.out.println(customArrayList.get(i));
        }


    }
}
