//
//  DI+SwInject.swift
//  MultiplatformApp
//
//  Created by Denis Ustavschikov on 10/09/2019.
//  Copyright © 2019 Denis Ustavschikov. All rights reserved.
//


import SwinjectStoryboard
//import MultiplatformModule

extension SwinjectStoryboard {
    
    @objc class func setup() {
        registerRepositories()
        registerInteractors()
        registerControllers()
    }
    
    @objc class func registerRepositories() {
//        defaultContainer.register(INewsRepository.self) { r in
//            NewsReposiotry()
//        }
    }

    
    @objc class func registerInteractors() {
//        defaultContainer.register(NewsInteractor.self) { r in
//            FrozenNewsInteractor(newsRepository: r.resolve(INewsRepository.self)!)
//        }
    }
    
    @objc class func registerControllers() {
//        defaultContainer.storyboardInitCompleted(ViewController.self) { (r, viewController) in
//            viewController.newsInteractor = r.resolve(NewsInteractor.self)
//        }
    }
    
}
