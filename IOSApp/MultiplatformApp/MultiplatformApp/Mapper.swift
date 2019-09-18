//
//  Mapper.swift
//  MultiplatformApp
//
//  Created by Denis Ustavschikov on 10/09/2019.
//  Copyright © 2019 Denis Ustavschikov. All rights reserved.
//

import Foundation

protocol Mapper {
    associatedtype Target
    associatedtype Source
    
    func map(item: Source) -> Target
}
