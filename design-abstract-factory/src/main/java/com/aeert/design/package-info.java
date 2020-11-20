/**
 * @Author l'amour solitaire
 * @Description 工厂方法模式
 * 抽象工厂模式，提供一个创建一系列相关或相互依赖对象的接口，而无需指定它们具体的类。
 * 抽象工厂模式（Abstract Factory Pattern）是围绕一个超级工厂创建其他工厂。该超级工厂又称为其他工厂的工厂。
 * 在抽象工厂模式中，接口是负责创建一个相关对象的工厂，不需要显式指定它们的类。每个生成的工厂都能按照工厂模式提供对象。
 * 实际应用场景：Spring中的BeanFactory
 * 例子：数据库切换
 * @Date 2020/11/19 上午10:28
 **/
package com.aeert.design;