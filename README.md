# DAG-matrix-generator-from-featureset
To explore all the combination of overall IoT system and automate the task, a java code DAG Adjacency Matrix Generator is written, which is described in Algorithm below

Input: User required cost and accuracy values: user_cost_score and user_accuracy_score; Proximity dataset, Temperature dataset and Location dataset
Output: Adjacency matrices of respective DAGs i.e. recommendations of the required system.

1) Calculate cost-rating & accuracy-rating of each component combination of respective feature.
2) If user_cost_score = cost-rating and user_accuracy_score = accuracy-rating then
     Fetch tuples from Proximity dataset and store in matched-proximity-tuples 
     Fetch tuples from Temperature dataset and store in matched-temperature-tuples
     Fetch tuples from Location dataset and store in matched-location-tuples
3) Fetch tuple P_(i ), tuple T_(j )and tuple L_(k ) 
     where P_(i )∈ matched-proximity-tuples, T_(j )∈ matched-temperature-tuples, L_(k )∈ matched-location-tuples, such that combination of i,  j and k is unique.
4) Create an empty ArrayList Component_list.
5) Insert each component from tuplesP_(i ), T_(j )and L_(k )into ArrayList Component_List.
6) Assign no_of_edges = unique component in Component_List
7) Create 2-d array edge_list_array[][]
8) Identify edges between components from tuples P_(i ), tuple T_(j )and tuple L_(k )by mapping it from to Component_List, and insert them into edge_list_array[][].
9) Call function generate_adjacency_matrix (no_of_edges, edge_list_array), it output adjacency_matrix[][] of the resulted directed graph.
10) Repeat from step 2 until all tuple combination are selected.

