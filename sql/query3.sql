--Select all parties with a number of policies for each

SELECT party.*, policy.policy_id  FROM party, policy WHERE party.party_id = policy.party_id;
