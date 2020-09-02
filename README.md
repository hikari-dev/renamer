# renamer
## 由来
网上下的番的名字好长，想改成简短的名字或者去掉名字只要episode编号(比如由`[JOJO&UHA-WING&Kamigami][JoJo's Bizarre Adventure - Golden Wind][1][BDRIP 1920x1080][x264_DTS-HDMA].mkv`改为`jojo[1].mkv`)，但是一个一个改太麻烦了，于是此工具就诞生了。

## 使用说明

`java -jar renamer.jar path target replacement`

| argument                | description                                    |
| ----------------------- | :--------------------------------------------- |
| `path`                  | 文件所处文件夹路径                             |
| `target`                | 想要替换掉的名字                               |
| `replacement`(Optional) | 想要替换成为的名字（可空，默认替换成空字符串） |

拿上面的例子来讲，先使用

`java -jar renamer.jar "D:\Anime\jojo" "[JOJO&UHA-WING&Kamigami][JoJo's Bizarre Adventure - Golden Wind]" "jojo"`  

然后使用

`java -jar renamer.jar "D:\Anime\jojo" "[BDRIP 1920x1080][x264_DTS-HDMA]"`    

即可实现上面的需求
