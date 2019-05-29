package day18;
//（一）
//1.Arraylist和Linkedlist 区别和联系
//2.HashSet和ArrayList相比区别
//3.HashSet和HashMap的区别
/*
 * 1.Arraylist和Linkedlist 区别和联系
 * 都时候List接口的实现类
 * 区别：
 * （1）底层数据结构：
 *    Arraylist  ：数组来实现
 *    Linkedlist：  链表来实现
 * （2）特点
 *    Arraylist：可以重复、有序，连续存储空间来完成有序性
 *    Linkedlist：可以重复，有序，通过数据域指针来完成有序性
 *    
 *2.HashSet和ArrayList相比区别
 *Set 和 List
 *HashSet 是Set的实现类，元素不可重复，无序，
 *        HashSet 不可重复，是通过hashcode来判断的重复性。
 *        将元素对象所在的类中equals方法和hashcode()方法
 *        
 *        
 *ArrayList 是 List实现类，可重复，  有序
 *
 *
 *3.HashSet和HashMap的区别
 *HashSet 是Set的实现类
 *HashMap 是Map的实现类
 *联系：内部都采用了哈希映射结构
 *区别： HashSet  众多单个元素，每个元素只包含一个对象    每个元素之间不可重复（equals方法）
 *     HashMap  众多键值对   每个元素都包含有两个对象（key和value）   每个元素的key不可重复（compareTo方法）
 *     
 *     
 *
 *
 * 
 */

