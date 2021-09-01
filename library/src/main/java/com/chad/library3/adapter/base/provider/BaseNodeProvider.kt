package com.chad.library3.adapter.base.provider

import com.chad.library3.adapter.base.BaseNodeAdapter
import com.chad.library3.adapter.base.entity.node.BaseNode

abstract class BaseNodeProvider : BaseItemProvider<BaseNode>() {

    override fun getAdapter(): BaseNodeAdapter? {
        return super.getAdapter() as? BaseNodeAdapter
    }

}