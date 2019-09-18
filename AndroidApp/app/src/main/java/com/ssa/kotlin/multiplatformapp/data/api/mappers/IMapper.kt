package com.ssa.kotlin.multiplatformapp.data.api.mappers

interface IMapper<TSource, TTarget> {

    fun map(item: TSource): TTarget

}