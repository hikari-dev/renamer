@file:JvmName("Main")

package dev.hikari

import java.io.File

fun main(args: Array<String>) {
    if (args.size < 2) {
        println("参数没填齐啊喂")
        return
    }
    val path = args[0]
    val target = args[1]
    val replacement = if (args.size < 3) {
        ""
    } else {
        args[2]
    }
    println("path->$path,target->$target,replacement->$replacement")

    val dir = File(path)
    if (!dir.isDirectory) {
        println("路径要是个文件夹路径啊喂")
        return
    }
    dir.walk()
        .maxDepth(1)
        .drop(1)
        .forEach {
            if (it.isFile && it.name.contains(target)) {
                val newName = it.name.replaceFirst(target, replacement)
                if (it.renameTo(File(path, newName))) {
                    println("${it.name} has been renamed to $newName")
                } else {
                    println("${it.name} rename failed")
                }
            }
        }
    println("All done!")
}