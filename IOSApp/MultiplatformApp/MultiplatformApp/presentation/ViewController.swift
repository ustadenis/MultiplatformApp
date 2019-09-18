//
//  ViewController.swift
//  MultiplatformApp
//
//  Created by Denis Ustavschikov on 09/09/2019.
//  Copyright © 2019 Denis Ustavschikov. All rights reserved.
//

import UIKit
//import MultiplatformModule

class ViewController: UIViewController {
    
    @IBOutlet weak var newsTableView: UITableView!
    
//    var newsInteractor: NewsInteractor!
    
//    private var news: [News] = [] {
//        didSet {
//            newsTableView.reloadData()
//        }
//    }
    
    override func viewDidAppear(_ animated: Bool) {
        super.viewDidAppear(animated)
//        DispatchQueue.global().async { [weak self] in
//            let news = self?.newsInteractor?.retrieveNews() ?? []
//            DispatchQueue.main.async {
//                self?.news = news
//            }
//        }
    }

}

extension ViewController: UITableViewDelegate, UITableViewDataSource {
    public func tableView(_ tableView: UITableView, numberOfRowsInSection section: Int) -> Int {
        return 0
//        return news.count
    }
    
    public func numberOfSections(in tableView: UITableView) -> Int {
        return 1
    }
    
    public func tableView(_ tableView: UITableView, cellForRowAt indexPath: IndexPath) -> UITableViewCell {
        guard let cell = tableView.dequeueReusableCell(withIdentifier: "newsCell", for: indexPath) as? NewsItemCell else {
            fatalError()
        }
//        let data = news[indexPath.row]
//        cell.newsDescription.text = data.newsDescription
//        cell.newsTitle.text = data.newsTitle
//
//        cell.newsImage.image = UIImage(named: "no-image")
//
//        if let iconUrl = data.iconUrl {
//            let url = URL(string: iconUrl)
//            if let unwrappedUrl = url {
//                DispatchQueue.global().async {
//                    if let data = try? Data(contentsOf: unwrappedUrl) {
//                        DispatchQueue.main.async {
//                            cell.newsImage.image = UIImage(data: data)
//                        }
//                    }
//                }
//            }
//        }
//
        return cell
    }
}

