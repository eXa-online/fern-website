/**
 * This file was auto-generated by Fern from our API Definition.
 */
import * as serializers from "../../../../..";
import * as EXaOnlineGmbHFernWebsite from "../../../../../../api";
import * as core from "../../../../../../core";
export declare const BlogPostCollection: core.serialization.ObjectSchema<serializers.fixtures.BlogPostCollection.Raw, EXaOnlineGmbHFernWebsite.fixtures.BlogPostCollection>;
export declare namespace BlogPostCollection {
    interface Raw {
        items: serializers.fixtures.BlogPost.Raw[];
        total: number;
        offset: number;
        limit: number;
    }
}