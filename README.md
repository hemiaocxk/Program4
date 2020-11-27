# Program4
java实验4
## 阅读程序
## 一、实验目的 
1. 掌握字符串String及其方法的使用 
2. 掌握文件的读取/写入方法；
3. 掌握异常处理结构 。
## 二、实验内容
在某课上,学生要提交实验结果，该结果存储在一个文本文件A中。 
文件A包括两部分内容： 一是学生的基本信息； 二是学生处理后的作业信息，该作业的业务逻辑内容是：利用已学的字符串处理知识编程完成《长恨歌》古诗的整理对齐工作，写出功能方法；
- 实现如下功能：  
1. 每7个汉字加入一个标点符号，奇数时加“，”，偶数时加“。”
2. 允许提供输入参数，统计古诗中某个字或词出现的次数
3. 输入的文本来源于文本文件B读取，把处理好的结果写入到文本文件A
4. 考虑操作中可能出现的异常，在程序中设计异常处理程序 
- 附加要求： 
1. 设计学生类； 
2. 采用交互式方式实例化某学生； 
3. 设计程序完成上述的业务逻辑处理，并且把“古诗处理后的输出”结果存储到学生基本信息所在的文本文件A中。 
## 三、核心代码
```
      FileReader fInputStream = new FileReader(file);//读取D盘文件
			FileWriter fOutputStream  = new FileWriter("D:\\TextB.txt");//向文件中追加数据
			int p=(int)file.length();
			char[] a = new char[p];
			fOutputStream.write(student.toString());
			fInputStream.read(a);
			int x=0;
			for(int j = 7;j<=file.length()-1;j=j+7,x+=7) {
				if(j%2==0) {//余数为零
					for(int i=x;i<j;i++) {
					fOutputStream.write(a[i]);
					}
					fOutputStream.write("。\n");
					
				}else {//余数不为零
					for(int i=x;i<j;i++) {
					fOutputStream.write(a[i]);
					}
					fOutputStream.write(",\n");
				}

```
```
        FileReader f = new FileReader("D:\\TextB.txt");
				String source =null;
				String key="";
				//从文档中接受诗词
				BufferedReader reader=new BufferedReader(f);
				source =reader.readLine();
				key="三";//待统计出现频率的字
				int num=GetFrequency(source,key);
				System.out.println(key+"在这段话中出现了"+num+"次");
        
        private static int GetFrequency(String source, String key) {
			// TODO Auto-generated method stub
			int i,j,count=0;
			int l1=source.length();//这段话的长度
			int l2=key.length();//待统计文字的长度
			for(i=0;i<l1-l2;i++){
				for(j=0;j<l2;j++){//统计文字和这段话逐字符进行比较
					if(key.charAt(j)!=source.charAt(j+i)){
						break;
					}
				}
				if(j>=key.length()){
					count++;
				}
			}
			return count;
		}
				
```
## 四、运行结果
![RUNOOB 图标](https://p.qlogo.cn/qqmail_head/fTW3oLibWre2icgHmMng0BEl2Oia3O6E8xxICmF1s5je8OhwQt2jzKkD65YyOtvW3dQhb60sAETviaQ/0)
![RUNOOB 图标](https://p.qlogo.cn/qqmail_head/fTW3oLibWre2icgHmMng0BEl2Oia3O6E8xxICmF1s5je8OnFjXiaMSuQmW1bg1pTfILlwY7BsVuxkLE/0)
## 五、实验感想
通过本次实验，我掌握了字符串String及其方法的使用以及文件的读取/写入方法 ，在整理古诗时遇到了转义符“\n”无法换行的问题，后采用了String line = System.getProperty("line.separator");方法，成功实现了换行功能。
