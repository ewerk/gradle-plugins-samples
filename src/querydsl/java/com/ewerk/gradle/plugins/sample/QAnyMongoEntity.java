package com.ewerk.gradle.plugins.sample;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QAnyMongoEntity is a Querydsl query type for AnyMongoEntity
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QAnyMongoEntity extends EntityPathBase<AnyMongoEntity> {

    private static final long serialVersionUID = -324460055L;

    public static final QAnyMongoEntity anyMongoEntity = new QAnyMongoEntity("anyMongoEntity");

    public final StringPath id = createString("id");

    public QAnyMongoEntity(String variable) {
        super(AnyMongoEntity.class, forVariable(variable));
    }

    public QAnyMongoEntity(Path<? extends AnyMongoEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QAnyMongoEntity(PathMetadata metadata) {
        super(AnyMongoEntity.class, metadata);
    }

}

