package com.ewerk.gradle.plugins.sample;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QAnyQueryEntity is a Querydsl query type for AnyQueryEntity
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QAnyQueryEntity extends EntityPathBase<AnyQueryEntity> {

    private static final long serialVersionUID = 1261955773L;

    public static final QAnyQueryEntity anyQueryEntity = new QAnyQueryEntity("anyQueryEntity");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public QAnyQueryEntity(String variable) {
        super(AnyQueryEntity.class, forVariable(variable));
    }

    public QAnyQueryEntity(Path<? extends AnyQueryEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QAnyQueryEntity(PathMetadata metadata) {
        super(AnyQueryEntity.class, metadata);
    }

}

