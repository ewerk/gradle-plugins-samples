package com.ewerk.gradle.plugins.sample;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QAnyJpaEntity is a Querydsl query type for AnyJpaEntity
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QAnyJpaEntity extends EntityPathBase<AnyJpaEntity> {

    private static final long serialVersionUID = -1421613040L;

    public static final QAnyJpaEntity anyJpaEntity = new QAnyJpaEntity("anyJpaEntity");

    public final NumberPath<Integer> counter = createNumber("counter", Integer.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public QAnyJpaEntity(String variable) {
        super(AnyJpaEntity.class, forVariable(variable));
    }

    public QAnyJpaEntity(Path<? extends AnyJpaEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QAnyJpaEntity(PathMetadata metadata) {
        super(AnyJpaEntity.class, metadata);
    }

}

