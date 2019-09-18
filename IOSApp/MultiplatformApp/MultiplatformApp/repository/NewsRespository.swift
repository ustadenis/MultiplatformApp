//
//  NewsRespository.swift
//  MultiplatformApp
//
//  Created by Denis Ustavschikov on 10/09/2019.
//  Copyright © 2019 Denis Ustavschikov. All rights reserved.
//

import Foundation
//import MultiplatformModule
//
//typealias Serialization = [String : Any]
//
//class NewsReposiotry: INewsRepository {
//
//    private let newsMapper: NewsMapper = NewsMapper()
//
//    func retrieveNews() -> [News] {
//        let url = URL(string: "https://newsapi.org/v2/everything?q=bitcoin&from=2019-08-10&sortBy=publishedAt&apiKey=d2cb4413e0024edeabe6c45d7844c291")!
//
//        let session = URLSession(configuration: .ephemeral, delegate: nil, delegateQueue: .main)
//        var result: [NewsResponse] = []
//        var news: [News] = []
//
//        let (jsonData, _, _) = session.synchronousDataTask(with: url)
//
//        guard let data = jsonData,
//            let json = try? JSONSerialization.jsonObject(with: data, options: .mutableContainers),
//            let serializedJson = json as? Serialization,
//            let articles = serializedJson["articles"] as? [Serialization]
//            else {
//                return []
//        }
//        articles.forEach({ (article) in
//            if let newsResponse = NewsResponse(json: article) {
//                result.append(newsResponse)
//            }
//        })
//        news = newsMapper.map(item: result)
//
//        return news
//    }
//
//}
//
//extension URLSession {
//    func synchronousDataTask(with url: URL) -> (Data?, URLResponse?, Error?) {
//        var data: Data?
//        var response: URLResponse?
//        var error: Error?
//        
//        let semaphore = DispatchSemaphore(value: 0)
//
//        let dataTask = self.dataTask(with: url) {
//            data = $0
//            response = $1
//            error = $2
//
//            semaphore.signal()
//        }
//        dataTask.resume()
//
//        _ = semaphore.wait(timeout: .distantFuture)
//
//        return (data, response, error)
//    }
//}
