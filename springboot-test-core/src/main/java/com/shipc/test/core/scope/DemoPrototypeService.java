package com.shipc.test.core.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("prototype") // 声明Scope为Prototype
public class DemoPrototypeService {

}
