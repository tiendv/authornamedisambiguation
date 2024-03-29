/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uit.tkorg.and.core.features;

import uit.tkorg.and.models.Publication;

/**
 *
 * @author DucHuynh
 */
public interface FeaturesBase {    
    public float makeJaccardSimilarity(Publication publicationA, Publication publicationB);
    public float makeLevenshteinSimilarity (Publication publicationA, Publication publicationB);
    public float makeJaroSimilarity (Publication publicationA, Publication publicationB);
    public float makeSmithWatermanSimilarity (Publication publicationA, Publication publicationB);
    public float makeOverlapCoefficientSimilarity (Publication publicationA, Publication publicationB);
    public float makeJaroWinklerSimilarity (Publication publicationA, Publication publicationB);
    public float makeMongeElkanSimilarity (Publication publicationA, Publication publicationB);
}
